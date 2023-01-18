package mpi.eudico.client.annotator.commands;

import mpi.eudico.client.annotator.TimeScale;
import mpi.eudico.client.annotator.ViewerManager2;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 * Action to move the media playhead backward with the number of seconds 
 * represented by the visible part of the main timeline view. This is
 * similar to the "page up" functionality in some applications.
 */
@SuppressWarnings("serial")
public class PreviousScrollViewCA extends CommandAction {
    private Icon icon;

    /**
     * Creates a new PreviousScrollViewCA instance
     *
     * @param theVM the viewer manager
     */
    public PreviousScrollViewCA(ViewerManager2 theVM) {
        //super();
        super(theVM, ELANCommandFactory.PREVIOUS_SCROLLVIEW);

        icon = new ImageIcon(this.getClass().getResource("/mpi/eudico/client/annotator/resources/GoToPreviousScrollviewButton.gif"));
        putValue(SMALL_ICON, icon);

        putValue(Action.NAME, "");
    }

    /**
     * Creates a new {@code PreviousScrollViewCommand}.
     */
    @Override
	protected void newCommand() {
        command = ELANCommandFactory.createCommand(vm.getTranscription(),
                ELANCommandFactory.PREVIOUS_SCROLLVIEW);
    }

    /**
     * @return the media player
     */
    @Override
	protected Object getReceiver() {
        return vm.getMasterMediaPlayer();
    }

    /**
     * @return an array of size 1, containing the {@code TimeScale} instance
     */
    @Override
	protected Object[] getArguments() {
        Object[] args = new Object[1];
        args[0] = vm.getTimeScale();

        return args;
    }
}
