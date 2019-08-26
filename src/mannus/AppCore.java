package mannus;

import mannus.gui.MannusFrame;
import javax.swing.JFrame;
import java.io.File;
import mannus.newGui.NewJFrame;

/**
 * @author Kim Viberti <vibertikim@yahoo.it>
 * @since 2019/07/27
 * Class invariants:
 *   1) nSeasons always reflects number of items in season_list[]
 *   2) seasonsWithData holds the Strings of the years which data can be loaded by the running program in the editor
 *   3) in "bin" directory files are named "S2019", "S2020"... name stands for: Season yyyy
 */
public class AppCore {
    public String current_date; //format "yyyy/mm/dd": months indexed [1-12] (July is 7...)
    public String year, month, day; //month indexed [1-12] (like above)
    private String binary_path_name; //C:\Users\Kimjie\AppData\Roaming\Mannus Manager\bin
    private MannusSeason[] seasons_list;
    private String[] seasonsWithData;
    private int nSeasons; //reflects the number of seasons in season_list
    private JFrame mainFrame;
    //Constructors---------------------------------------------------------------------------------------------------------------
    public AppCore(String date) throws Error {
        current_date = Main.get_actual_date();
        binary_path_name = DM.application_start();

        String[] date_fields = current_date.split("/");
        year = date_fields[0];
        month = date_fields[1]; //indexed [1-12]
        day = date_fields[2];

        if(new File(binary_path_name + (char)92 + "S" + year).exists()) { //there is data stored in AppData/Raoming...
            //seasonsWithData
            //nSeasons
            //season_list
            throw new Error("DA FINIRE costruttore AppCore! (mandare messaggio a Kim)");
        } else { //there is no stored data for the login season
            seasons_list = new MannusSeason[] {
                                                new MannusSeason(Integer.parseInt(year)),
                                                null
                                              };
            seasonsWithData = new String[]{year};
            nSeasons = 1;
        }
        // Mostrare la finestra dell'applicazione
        NewJFrame f = new NewJFrame(this);
        f.initializeWithData();
        f.setVisible(true);
        /*
        mainFrame = new MannusFrame(this);
        mainFrame.paint(mainFrame.getGraphics());
        mainFrame.setVisible(true);*/
    }
    //set() & get()--------------------------------------------------------------------------------------------------------------
    public String[] getSeasonsWithData() {return seasonsWithData;}
    //Utility--------------------------------------------------------------------------------------------------------------------
    public void add(MannusSeason s) {
        if(nSeasons >= seasons_list.length) {
            MannusSeason[] tmp = new MannusSeason[seasons_list.length * 2];

            for(int i = 0; i < nSeasons + 1; ++i) { //+1 to add s
                tmp[i] = seasons_list[i];
            }

            seasons_list = tmp;
        } else {
            seasons_list[nSeasons] = s;
        }
        ++nSeasons;
    }
    
    public String[] getYears() {
        String[] str = new String[nSeasons];
        
        for(int i = 0; i < nSeasons; ++i) {
            seasons_list[i].getYear();
        }
        
        return str;
    }
    //---------------------------------------------------------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------------------------------------------------------
}
