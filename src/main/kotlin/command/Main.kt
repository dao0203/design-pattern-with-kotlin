package command

import java.awt.event.MouseEvent
import java.awt.event.MouseMotionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.Box
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JFrame
import kotlin.system.exitProcess

class Main(
    title: String,
) : JFrame(title), MouseMotionListener, WindowListener {
    private val history = MacroCommand()
    private val canvas = DrawCanvas(400, 400, history)
    private val clearButton = JButton("clear")

    init {
        this.addWindowListener(this)
        canvas.addMouseMotionListener(this)
        clearButton.addActionListener {
            history.clear()
            canvas.repaint()
        }
        val buttonBox = Box(BoxLayout.X_AXIS)
        buttonBox.add(clearButton)
        val mainBox = Box(BoxLayout.Y_AXIS)
        mainBox.add(buttonBox)
        mainBox.add(canvas)
        contentPane.add(mainBox)
        pack()
        isVisible = true
    }

    override fun mouseDragged(e: MouseEvent?) {
        val cmd = DrawCommand(canvas, e?.point ?: return)
        history.append(cmd)
        cmd.execute()
    }

    override fun mouseMoved(e: MouseEvent?) {
    }

    override fun windowOpened(e: WindowEvent?) {
    }

    override fun windowClosing(e: WindowEvent?) {
        exitProcess(0)
    }

    override fun windowClosed(e: WindowEvent?) {
    }

    override fun windowIconified(e: WindowEvent?) {
    }

    override fun windowDeiconified(e: WindowEvent?) {
    }

    override fun windowActivated(e: WindowEvent?) {
    }

    override fun windowDeactivated(e: WindowEvent?) {
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Main("Command Pattern Sample")
        }
    }
}