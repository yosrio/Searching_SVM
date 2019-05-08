/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.SearchingResult;

/**
 *
 * @author Yos Rio
 * 165314041
 */
public class TableModelData extends AbstractTableModel {

    private List<SearchingResult> doc = new ArrayList<SearchingResult>();

    public TableModelData(List<SearchingResult> doc) {
        this.doc = doc;
    }

    @Override
    public int getRowCount() {
        return doc.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SearchingResult b = doc.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return b.getDocument().getId();
            case 1:
                return b.getDocument().getAuthor() + " - " + b.getDocument().getTitle();
            case 2:
                return b.getSimilarity();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id Document";
            case 1:
                return "Title Song";
            case 2:
                return "Cosine Similarity";
            default:
                return "";
        }
    }
}
