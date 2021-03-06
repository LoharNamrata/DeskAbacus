package com.mental.abacus.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.mental.abacus.adaptor.DefaultAbacusABRow;
import com.mental.abacus.data.impl.DefaultAbacusABRowData;

public class DefaultAbacusDNImplemetation extends DefaultAbacusABRow {

	private DefaultAbacusABRowData defaultAbacusABRowData = new DefaultAbacusABRowData();

	public Collection<Integer> generateARow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 20) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(5, 9));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(0, 0));
			}
		}
		Collection<Integer> row2 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 15) {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(6, 9));
			} else {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(0, 0));
			}
		}
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 16) {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 5));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 8 || i == 15 || i == 22 || i == 4 || i == 11 || i == 18) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 5));
			} else {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 3 || i == 10 || i == 17 || i == 5) {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 4));
			} else {
				row5.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row6 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 7 || i == 14 || i == 21 || i == 9) {
				row6.add(this.defaultAbacusABRowData.negativeSingleDigit(3, 5));
			} else {
				row6.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row7 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 4 || i == 11 || i == 18 || i == 23 || i == 24 || i == 25) {
				row7.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row7.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row8 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 6 || i == 13 || i == 20 || i == 22) {
				row8.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row8.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row9 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 23 || i == 24 || i == 25 || i == 8 || i == 15 || i == 22) {
				row9.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row9.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}
		Collection<Integer> row10 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i == 5 || i == 12 || i == 19 || i == 8) {
				row10.add(this.defaultAbacusABRowData.negativeSingleDigit(9, 9));
			} else {
				row10.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 9));
			}
		}

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);
		row.addAll(row5);
		row.addAll(row6);
		row.addAll(row7);
		row.addAll(row8);
		row.addAll(row9);
		row.addAll(row10);

		return row;
	}

	public Collection<Integer> generateBRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(5, 9));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(50, 80));
			}
		}
		Collection<Integer> row2 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(1, 5));
			} else {
				row2.add(this.defaultAbacusABRowData.positiveSingleDigit(30, 70));
			}
		}
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 5 == 0) {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(20, 50));
			} else {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(5, 6));
			} else {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(20, 20));
			}
		}
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 5 != 0) {
				row5.add(this.defaultAbacusABRowData.positiveSingleDigit(50, 99));
			} else {
				row5.add(this.defaultAbacusABRowData.positiveSingleDigit(3, 9));
			}
		}
		Collection<Integer> row6 = this.defaultAbacusABRowData.positiveSingle(6, 9, 25);
		Collection<Integer> row7 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				row7.add(this.defaultAbacusABRowData.negativeSingleDigit(4, 5));
			} else {
				row7.add(this.defaultAbacusABRowData.negativeSingleDigit(33, 33));
			}
		}
		Collection<Integer> row8 = this.defaultAbacusABRowData.positiveSingle(3, 9, 25);

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);
		row.addAll(row5);
		row.addAll(row6);
		row.addAll(row7);
		row.addAll(row8);

		return row;
	}

	public Collection<Integer> generateCRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 10) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(55, 99));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(0, 0));
			}
		}
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(30, 70, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(40, 50));
			} else {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(20, 30));
			}
		}
		Collection<Integer> row4 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				row4.add(this.defaultAbacusABRowData.positiveSingleDigit(40, 60));
			} else {
				row4.add(this.defaultAbacusABRowData.negativeSingleDigit(33, 50));
			}
		}

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);

		return row;
	}

	public Collection<Integer> generateDRow() {
		Collection<Integer> row = new ArrayList<Integer>();

		Collection<Integer> row1 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i > 10) {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(55, 99));
			} else {
				row1.add(this.defaultAbacusABRowData.positiveSingleDigit(0, 0));
			}
		}
		Collection<Integer> row2 = this.defaultAbacusABRowData.positiveSingle(30, 70, 25);
		Collection<Integer> row3 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				row3.add(this.defaultAbacusABRowData.positiveSingleDigit(30, 60));
			} else {
				row3.add(this.defaultAbacusABRowData.negativeSingleDigit(33, 43));
			}
		}
		Collection<Integer> row4 = this.defaultAbacusABRowData.positiveSingle(30, 70, 25);
		Collection<Integer> row5 = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				row5.add(this.defaultAbacusABRowData.positiveSingleDigit(40, 60));
			} else {
				row5.add(this.defaultAbacusABRowData.negativeSingleDigit(33, 50));
			}
		}

		row.addAll(row1);
		row.addAll(row2);
		row.addAll(row3);
		row.addAll(row4);
		row.addAll(row5);

		return row;
	}

	public Map<String, Collection<Integer>> getTables() {
		Map<String, Collection<Integer>> row = new HashMap<String, Collection<Integer>>();

		row.put("A", this.generateARow());
		row.put("B", this.generateBRow());
		row.put("C", this.generateCRow());
		row.put("D", this.generateDRow());

		return row;
	}

}
