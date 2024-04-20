package command


class MacroCommand: Command {
    private val commands = mutableListOf<Command>()

    override fun execute() {
        commands.forEach { it.execute() }
    }

    fun append(command: Command) {
        if (command != this) {
            commands.add(command)
        }
    }

    fun undo() {
        if (commands.isNotEmpty()) {
            commands.removeAt(commands.size - 1)
        }
    }

    fun clear() {
        commands.clear()
    }
}