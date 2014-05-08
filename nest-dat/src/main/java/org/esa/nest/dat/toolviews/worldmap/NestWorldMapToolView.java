/*
 * Copyright (C) 2014 by Array Systems Computing Inc. http://www.array.ca
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see http://www.gnu.org/licenses/
 */
package org.esa.nest.dat.toolviews.worldmap;

import org.esa.beam.visat.toolviews.worldmap.WorldMapToolView;

/**
 * The window displaying the world map.
 */
public class NestWorldMapToolView extends WorldMapToolView {

    public NestWorldMapToolView() {
    }
/*
    @Override
    public JComponent createControl() {
        final JPanel mainPane = new JPanel(new BorderLayout(4, 4));
        mainPane.setPreferredSize(new Dimension(320, 160));

        worldMapDataModel = new NestWorldMapPaneDataModel();
        final NestWorldMapPane worldMapPane = new NestWorldMapPane(worldMapDataModel);
        worldMapPane.setNavControlVisible(true);
        mainPane.add(worldMapPane, BorderLayout.CENTER);

        VisatApp.getApp().addProductTreeListener(new WorldMapPTL());

        // Add an internal frame listener to VISAT so that we can update our
        // world map window with the information of the currently activated
        // product scene view.
        //
        VisatApp.getApp().addInternalFrameListener(new WorldMapIFL());
        setProducts(VisatApp.getApp().getProductManager().getProducts());
        setSelectedProduct(VisatApp.getApp().getSelectedProduct());

        return mainPane;
    }

    private class WorldMapIFL extends InternalFrameAdapter {

        @Override
        public void internalFrameActivated(final InternalFrameEvent e) {
            final Container contentPane = e.getInternalFrame().getContentPane();
            Product product = null;
            if (contentPane instanceof ProductSceneView) {
                product = ((ProductSceneView) contentPane).getProduct();
            } else if(contentPane instanceof PolarView) { 
                product = ((PolarView) contentPane).getProduct();
            }
            setSelectedProduct(product);
        }
    }*/
}