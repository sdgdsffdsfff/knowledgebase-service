import React, { Component, useContext, useEffect, useState } from 'react';
import { observer } from 'mobx-react-lite';
import ViewMode from './ViewMode';
import EditMode from './EditMode';
import PageStore from '../../../stores';
import DocEmpty from '../../../../../components/DocEmpty/DocEmpty';

function DocEditor(props) {
  const {
    readOnly,
    loadWorkSpace,
    fullScreen,
    exitFullScreen,
    editDoc,
  } = props;
  const { pageStore } = useContext(PageStore);
  const { getMode: mode, getDoc: data, getSearchVisible: searchVisible } = pageStore;

  function renderDocEditor() {
    if (data) {
      if (mode === 'edit') {
        return (
          <EditMode />
        );
      } else {
        return (
          <ViewMode
            readOnly={readOnly}
            fullScreen={fullScreen}
            loadWorkSpace={loadWorkSpace}
            exitFullScreen={exitFullScreen}
            editDoc={editDoc}
          />
        );
      }
    } else {
      return (
        <DocEmpty mode={searchVisible ? 'search' : 'view'} />
      );
    }
  }

  return renderDocEditor();
}

export default observer(DocEditor);