package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellEditingStartedHandler {
	void onCellEditingStarted(CellEditingStartedEvent event);
}
