/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion;

/**
 *Clase que nos permite la interfaz grafica que es subclase de Clase Jlabel1
 * @author mayme
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Hint extends JLabel implements FocusListener, DocumentListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Show {
		ALWAYS, FOCUS_GAINED, FOCUS_LOST;
	}

	private JTextComponent component;
	private Document document;

	private Show show;
	private boolean showPromptOnce;
	private int focusLost;

	public Hint(String text, JTextComponent component) {
		this(text, component, Show.ALWAYS);
	}

	public Hint(String text, JTextComponent component, Show show) {
		this.component = component;
		setShow(show);
		document = component.getDocument();

		setText(text);
		setFont(component.getFont());
                
//		setForeground(component.getForeground());
		setForeground(Color.gray);
//		setBorder(new EmptyBorder(component.getInsets()));
		setHorizontalAlignment(JLabel.LEADING);

		component.addFocusListener(this);
		document.addDocumentListener(this);

		component.setLayout(new BorderLayout());
		component.add(this);
		checkForPrompt();
	}

	/**
	 * Método de conveniencia para cambiar el valor alfa del primer plano actual
         * Colorea según el valor específico..
	 *
	 * @param alpha
	 *            value in the range of 0 - 1.0.
	 */
	public void changeAlpha(float alpha) {
		changeAlpha((int) (alpha * 255));
	}

	/**
	 * Método de conveniencia para cambiar el valor alfa del primer plano actual
	 * Colorea seún el valor especifico
	 *
	 * @param alpha
	 *            value in the range of 0 - 255.
	 */
	public void changeAlpha(int alpha) {
		alpha = alpha > 255 ? 255 : alpha < 0 ? 0 : alpha;

		Color foreground = getForeground();
		int red = foreground.getRed();
		int green = foreground.getGreen();
		int blue = foreground.getBlue();

		Color withAlpha = new Color(red, green, blue, alpha);
		super.setForeground(withAlpha);
	}

	/**
	 * Método de conveniencia para cambiar el estilo de la fuente actual. El estilo
         * los valores se encuentran en la clase Font. Los valores comunes pueden ser: Font.BOLD,
         * Font.ITALIC y Font.BOLD + Font.ITALIC.
	 *
	 * @param style
	 *            value representing the the new style of the Font.
	 */
	public void changeStyle(int style) {
		setFont(getFont().deriveFont(style));
	}

	/**
	 * Tomar la propiedad Show
	 *
	 * @return Propiedad Show
	 */
	public Show getShow() {
		return show;
	}

	/**
	 *Establece la propiedad Mostrar mensaje para controlar cuándo se muestra el mensaje. Válido
         * los valores son:
         *
         * Show.AWLAYS (predeterminado): muestra siempre el indicador Show.Focus_GAINED: muestra
         * el aviso cuando el componente obtiene el foco (y ocultar el aviso cuando el foco
         * se pierde) Show.Focus_LOST: muestra el aviso cuando el componente pierde el foco
         * (y ocultar el aviso cuando se obtiene el foco)
         *
	 * @param show
	 *            a valid Show enum
	 */
	public void setShow(Show show) {
		this.show = show;
	}

	/**
	 * Toma propiedad showPromptOnce.
	 *
	 * @return propiedad  showPromptOnce .
	 */
	public boolean getShowPromptOnce() {
		return showPromptOnce;
	}

	/**
	 * Muestre el aviso una vez. Una vez que el componente ha ganado/perdido el foco una vez, el
         * el aviso no se volverá a mostrar.
	 *
	 * @param showPromptOnce
	 *            when true the prompt will only be shown once, otherwise it
	 *            will be shown repeatedly.
	 */
	public void setShowPromptOnce(boolean showPromptOnce) {
		this.showPromptOnce = showPromptOnce;
	}

	/**
	 * Compruebe si el indicador debe ser visible o no. La visibilidad será
         * cambio en las actualizaciones del Documento y en los cambios de enfoque.
	 */
	private void checkForPrompt() {
		// Se ha ingresado texto, elimine el mensaje

		if (document.getLength() > 0) {
			setVisible(false);
			return;
		}

		// El aviso ya se ha mostrado una vez, elimínelo

		if (showPromptOnce && focusLost > 0) {
			setVisible(false);
			return;
		}

		// Verifique la propiedad Mostrar y el enfoque del componente para determinar si el
		// debe mostrarse el aviso.

		if (component.hasFocus()) {
			if (show == Show.ALWAYS || show == Show.FOCUS_GAINED)
				setVisible(true);
			else
				setVisible(false);
		} else {
			if (show == Show.ALWAYS || show == Show.FOCUS_LOST)
				setVisible(true);
			else
				setVisible(false);
		}
	}

	// Implementar FocusListener

	public void focusGained(FocusEvent e) {
		checkForPrompt();
	}

	public void focusLost(FocusEvent e) {
		focusLost++;
		checkForPrompt();
	}

	// Implementar DocumentListener

	public void insertUpdate(DocumentEvent e) {
		checkForPrompt();
	}

	public void removeUpdate(DocumentEvent e) {
		checkForPrompt();
	}

	public void changedUpdate(DocumentEvent e) {
	}
}