package com.indvd00m.ascii.render;

import com.indvd00m.ascii.render.api.IPoint;

/**
 * importiamo com.indvd00m.ascii.render.api.IPoint;
 * Implementiamo la classe IPoint alla classe Point
 */

public class Point implements IPoint {
	/**
	 * La coordinata x rappresenta la posizione orizzontale dell'istanza Point.
	 * La coordinata y rappresenta la posizione verticale dell'istanza Point.
	 */
	protected int x;
	protected int y;

	/**
	 * mettiamo l'istanza point con metodo publico con variabili intere x e y.
	 *
	 @param x è la coordinata x del punto
	  * @param y è la coordinata y del punto
	 */
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * Riceve la cordinata x.
	 *
	 * @return ritorna la cordinata x.
	 */
	@Override
	public int getX() {
		return x;
	}

	/**
	 * 	Riceve la cordinata y.
	 * 	 *
	 * 	 * @return ritorna la cordinata y.
	 * @return
	 */
	@Override
	public int getY() {
		return y;
	}

	/**
	 * Ritorna il codice hash con le cordinate di questo punto.
	 *
	 * @return ritorna il risultato delle cordinate.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	/**
	 * Confronta questa coordinazione con la cordinata specificato per verificarne l'uguaglianza.
	 * * Le due coordinate sono uguali se hanno le stesse coordinate x e y.
	 * *
	 * * @param obj si confrontano le varie coordinazioni
	 * * @return vero se la coordinazione è uguale a questo a l'altra, altrimenti falso.
	 */
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
		Point other = (Point) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}

	/**
	 * Restituisce una rappresentazione delle coordinate in formato stringa dell'oggetto Point.
	 *La stringa restituita include i valori delle coordinate x e y aggiornati come "Point [x=" e ", y=" "]"
	 *@return una rappresentazione in formato stringa dell'oggetto Point
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Point [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}

}
