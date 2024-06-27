interface TodoProps {
  id: number;
  title: string;
  completed: boolean;
  onDelete: (id: number) => void;
}
// React.FC<TodoProps>
const handleChange = (e:React.ChangeEvent<HTMLInputElement>) => {
 
};
const handleSubmit = (e: React.FormEvent) => {
  e.preventDefault();
 
};

const Todo:React.FC< TodoProps>  = ({ id, title, completed, onDelete }) => {
  return (
    <div style={{ marginBottom: '1rem' }}>
      <input type="checkbox" checked={completed} readOnly />
      <input
        type="text"
        placeholder="Add a todo..."
        value={title}
        onChange={(e)=>handleChange(e)}
      />
      <span style={{ textDecoration: completed ? 'line-through' : 'none' }}>{title}</span>
      <button onClick={() => onDelete(id)}>Delete</button>
    </div>
  );
};

export default Todo;
