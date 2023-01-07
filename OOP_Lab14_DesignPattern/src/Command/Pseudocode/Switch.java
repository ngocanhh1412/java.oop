package Command.Pseudocode;

import java.util.LinkedList;
import java.util.List;

public class Switch {
    private List<Command> historycommands;

    public Switch() {
        this.historycommands = new LinkedList<>();
    }

    public void execute(Command command) {
        command.execute();
    }

    public void store(Command command) {
        this.historycommands.add(command);
    }

    public void storeAndExecute(Command command) {
        store(command);
        execute(command);
    }

    public void executeAllCommand() {
        for (Command command : historycommands) {
            execute(command);
        }
    }

}
