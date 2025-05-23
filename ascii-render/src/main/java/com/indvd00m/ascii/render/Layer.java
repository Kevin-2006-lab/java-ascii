package com.indvd00m.ascii.render;
/**
 * importiamo java.util.ArrayList;java.util.Collections;java.util.List;
 */

import com.indvd00m.ascii.render.api.IElement;
import com.indvd00m.ascii.render.api.ILayer;
import com.indvd00m.ascii.render.api.IRegion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * implementiamo i metodi dalla classe padre ILayer alla classe figlio Layer
 * com metodi protetti
 */
public class Layer implements ILayer {

	protected IRegion region;
	protected List<IElement> elements = new ArrayList<IElement>();
	protected boolean opacity;

	Layer(IRegion region) {
		super();
		this.region = region;
	}

	/**
	 * Returns le region associato con il layer.
	 *
	 * @return ritorna il risulato di region
	 */
	@Override
	public IRegion getRegion() {
		return region;
	}

	@Override
	public List<IElement> getElements() {
		return Collections.unmodifiableList(elements);
	}

	@Override
	public boolean isOpacity() {
		return opacity;
	}

}
