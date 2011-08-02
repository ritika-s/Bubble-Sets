package setvis;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.List;

/**
 * Defines a group of rectangles which are connected with lines.
 * 
 * @author Joschi <josua.krause@googlemail.com>
 * 
 */
public class Group {

	public final Rectangle2D[] rects;

	public final Line2D[] lines;

	public Group(final List<Rectangle2D> rects, final List<Line2D> lines) {
		this.rects = rects.toArray(new Rectangle2D[rects.size()]);
		this.lines = lines.toArray(new Line2D[lines.size()]);
	}

}
