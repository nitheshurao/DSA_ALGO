// src/components/AddTodo.js

import React, { useState } from 'react';
import { useDispatch } from 'react-redux';

const AddTodo = () => {
  const [todoText, setTodoText] = useState('');
  const dispatch = useDispatch();

  const handleAddTodo = () => {
    dispatch({ type: 'ADD_TODO', payload: { id: Date.now(), text: todoText } });
    setTodoText('');
  };

  return (
    <div>
      <input
        type="text"
        value={todoText}
        onChange={(e) => setTodoText(e.target.value)}
      />
      <button onClick={handleAddTodo}>Add Todo</button>
    </div>
  );
};

export default AddTodo;
