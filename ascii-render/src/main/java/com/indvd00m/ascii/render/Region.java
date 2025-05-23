
package com.indvd00m.ascii.render;
/**
 * Importiamo com.indvd00m.ascii.render.api.IRegion;
 */

import com.indvd00m.ascii.render.api.IRegion;

/**
 * Rappresenta una regione con coordinate x e y, x=larghezza y=altezza.
 * implementa l'interfaccia {@link IRegion} e fornisce metodi per
 * accedere alle proprietà della regione, come posizione e dimensioni.
 *
 * Le istanze di questa classe sono costanti una volta create, garantendo l'integrità
 * delle dimensioni e della posizione della regione.
 */
public class Region implements IRegion {

	protected int x;
	protected int y;
	protected int width;
	protected int height;

	public Region(int x, int y, int width, int height) {
		super();
		if (width < 0) {
			throw new IllegalArgumentException();
		}
		if (height < 0) {
			throw new IllegalArgumentException();
		}
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/**
	 * ritorna le coordinate x delle regioni.
	 *
	 * @return rittorna la coordinata x.
	 */
	@Override
	public int getX() {
		return x;
	}
	/**
	 * ritorna le coordinate y delle regioni.
	 *
	 * @return rittorna la coordinata y.
	 */
	@Override
	public int getY() {
		return y;
	}
	/**
	 *
	 *
	 * @return rittorna la width.
	 */
	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Region other = (Region) obj;
		if (height != other.height) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Region [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append("]");
		return builder.toString();
	}

}
