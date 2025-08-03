import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState("book");

  // if/else block
  let renderComponent;
  if (view === "book") {
    renderComponent = <BookDetails />;
  } else if (view === "blog") {
    renderComponent = <BlogDetails />;
  } else {
    renderComponent = <CourseDetails />;
  }

  //Ternary Operator example
  const showTitle = view === "book" ? "Books" : view === "blog" ? "Blogs" : "Courses";

  //IIFE for Advanced Control
  const renderUsingIIFE = (() => {
    switch (view) {
      case "book": return <BookDetails />;
      case "blog": return <BlogDetails />;
      case "course": return <CourseDetails />;
      default: return <p>Select a view</p>;
    }
  })();

  return (
    <div className="App" style={{ fontFamily: 'Arial', padding: '20px' }}>
      <h1>Blogger App</h1>

      <p><strong>View Mode:</strong> {showTitle}</p>

      <div style={{ marginBottom: "20px" }}>
        <button onClick={() => setView("book")}>Book</button>
        <button onClick={() => setView("blog")}>Blog</button>
        <button onClick={() => setView("course")}>Course</button>
      </div>

      <hr />

      {/* Logical AND Operator */}
      {view === "book" && <p>You are viewing Book Details</p>}
      {view === "blog" && <p>You are viewing Blog Details</p>}
      {view === "course" && <p>You are viewing Course Details</p>}

      <hr />

      {/* Render with if/else block */}
      <h3>Conditional Rendering with if/else</h3>
      {renderComponent}

      <hr />

      {/* Render with IIFE */}
      <h3>Conditional Rendering with IIFE</h3>
      {renderUsingIIFE}
    </div>
  );
}

export default App;
