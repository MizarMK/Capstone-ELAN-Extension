package mpi.eudico.client.annotator.commands;

import mpi.eudico.client.annotator.TimeScale;
import mpi.eudico.client.annotator.ViewerManager2;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 * An action to move the media playhead forward with the amount of seconds 
 * represented by (the visible part of) the main timeline view.
 * Similar to the "page down" function of some applications.
 */
@SuppressWarnings("serial")
public class NextScrollViewCA extends CommandAction {
    private Icon icon;

    /**
     * Creates a new NextScrollViewCA instance
     *
     * @param theVM the viewer manager
     */
    public NextScrollViewCA(ViewerManager2 theVM) {
        //super();
        super(theVM, ELANCommandFactory.NEXT_SCROLLVIEW);

        icon = new ImageIcon(this.getClass().getResource("/mpi/eudico/client/annotator/resources/GoToNextScrollviewButton.gif"));
        putValue(SMALL_ICON, icon);
        putValue(Action.NAME, "");
    }

    /**
     * Creates a new {@code NextScrollViewCommand}.
     */
    @Override
	protected void newCommand() {
        command = ELANCommandFactory.createCommand(vm.getTranscription(),
                ELANCommandFactory.NEXT_SCROLLVIEW);
    }

    /**
     *
     * @return the media player
     */
    @Override
	protected Object getReceiver() {
        return vm.getMasterMediaPlayer();
    }

    /**
     *
     * @return an array containing one object, the viewer manager's {@code TimeScale}.
     */
    @Override
	protected Object[] getArguments() {
        Object[] args = new Object[1];
        args[0] = vm.getTimeScale();

        return args;
    }
}
