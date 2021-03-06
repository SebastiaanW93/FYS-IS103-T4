/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.is103t4.corendonluggagesystem.scenes.main;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import me.is103t4.corendonluggagesystem.account.Account;
import me.is103t4.corendonluggagesystem.scenes.Controller;

/**
 *
 * @author finnb
 */
public class MainFrameController extends Controller {

    @FXML
    private TabPane tabPane;

    @Override
    public void postInit() {
	Tabs.initAll(main);
    }
    
    public void fillTabPane() {
	tabPane.getTabs().clear();
	Tabs[] tabs = Tabs.getTabsForRole(Account.getLoggedInUser().getRole());
	for (Tabs tab : tabs)
	    tabPane.getTabs().add(tab.getTab());
    }

}
