// src/Posts.js
import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Step 6: Load posts using fetch API
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
        this.setState({ hasError: true });
      });
  }

  // Step 7: Call loadPosts() in componentDidMount
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9: Catch any rendering errors
  componentDidCatch(error, info) {
    alert("An error occurred: " + error.message);
    console.log("Error info:", info);
  }

  // Step 8: Render post titles and bodies
  render() {
    return (
      <div>
        <h2>Blog Posts</h2>
        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
