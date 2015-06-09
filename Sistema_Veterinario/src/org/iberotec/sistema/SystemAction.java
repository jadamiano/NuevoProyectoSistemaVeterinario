/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iberotec.sistema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "org.iberotec.sistema.SystemAction"
)
@ActionRegistration(
        iconBase = "org/iberotec/sistema/Adobe Illustrator-01.png",
        displayName = "#CTL_SystemAction"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_SystemAction=System_Rupailla")
public final class SystemAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
