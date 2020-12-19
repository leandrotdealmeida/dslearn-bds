package com.devjapa.dslearn.observers;

import com.devjapa.dslearn.entities.Deliver;

public interface DeliverRevisionObserver {
	
	void onSaveRevision(Deliver deliver);

}
