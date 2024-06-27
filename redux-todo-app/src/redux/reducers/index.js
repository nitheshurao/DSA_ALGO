
import { combineReducers } from 'redux';
import todosReducer from './todos';

const rootReducer = combineReducers({
  todos: todosReducer
  // Add other reducers here if needed
});

export default rootReducer;