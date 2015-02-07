package com.baselet.element.settings;

import java.util.List;

import com.baselet.control.basics.XValues;
import com.baselet.control.enums.AlignHorizontal;
import com.baselet.control.enums.AlignVertical;
import com.baselet.element.facet.ElementStyleEnum;
import com.baselet.element.facet.Facet;
import com.baselet.element.facet.Settings;
import com.baselet.element.facet.common.SeparatorLineFacet;

public class SettingsText extends Settings {
	@Override
	public XValues getXValues(double y, int height, int width) {
		return new XValues(0, width);
	}

	@Override
	public AlignVertical getVAlign() {
		return AlignVertical.TOP;
	}

	@Override
	public AlignHorizontal getHAlign() {
		return AlignHorizontal.LEFT;
	}

	@Override
	public ElementStyleEnum getElementStyle() {
		return ElementStyleEnum.WORDWRAP;
	}

	@Override
	protected List<Facet> createFacets() {
		return listOf(Settings.ALL, SeparatorLineFacet.INSTANCE);
	}
}