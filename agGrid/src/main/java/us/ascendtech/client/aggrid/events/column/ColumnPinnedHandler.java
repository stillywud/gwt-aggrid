package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ColumnPinnedHandler {
	void onColumnPinned(ColumnPinnedEvent event);
}
