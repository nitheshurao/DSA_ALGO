import { createStore, applyMiddleware, compose } from 'redux';
import rootReducer from './reducers';
const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose;

const store = createStore(rootReducer, composeEnhancers(
    applyMiddleware(/* your middlewares here if any */)
    // Other store enhancers if any
));

export default store;