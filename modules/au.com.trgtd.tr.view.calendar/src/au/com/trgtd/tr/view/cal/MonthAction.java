package au.com.trgtd.tr.view.cal;

import au.com.trgtd.tr.appl.InitialAction;
import au.com.trgtd.tr.prefs.ui.utils.WindowUtils;
import java.awt.EventQueue;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;
import org.openide.windows.Mode;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import tr.model.Data;
import tr.model.DataLookup;

public final class MonthAction extends CallableSystemAction implements InitialAction {

    public MonthAction() {
        super();
        enableDisable();
        Lookup.Result<Data> r = DataLookup.instance().lookup(new Lookup.Template<>(Data.class));
        r.addLookupListener(new LookupListener() {
            @Override
            public void resultChanged(LookupEvent lookupEvent) {
                enableDisable();
            }
        });
    }

    @Override
    protected String iconResource() {
        return "au/com/trgtd/tr/view/cal/resource/month.png";
    }

    @Override
    public String getName() {
        return NbBundle.getMessage(getClass(), "CTL_MonthAction");
    }

    private void enableDisable() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Data data = DataLookup.instance().lookup(Data.class);
                setEnabled(data != null);
            }
        });
    }

    /** Gets the action identifier. */
    @Override
    public String getID() {
        return "month.view";
    }

    @Override
    public void performAction() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TopComponent tc = WindowManager.getDefault().findTopComponent("MonthTopComponent");
                if (null == tc) {
                    tc = new MonthTopComponent();
                }
                WindowUtils.closeWindows();
                Mode mode = WindowManager.getDefault().findMode("editor");
                if (mode != null) {
                    mode.dockInto(tc);
                }
                tc.open();
                tc.requestActive();
            }
        });
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }

    @Override
    public HelpCtx getHelpCtx() {
        return new HelpCtx("tr.view.calendar");
    }


}