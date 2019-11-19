import '../webapp/css/custom.css';
 
import React from 'react';
import ReactDOM from 'react-dom';


//이게 컴포넌트 렌더링! 이구나!
class Page2Page extends React.Component {
    render(){
        return (<h1 className='page2'>Hello World!</h1>);
    }

}
//var h1 = React.createElement('h1', null, 'Hello World!');
ReactDOM.render(
    <Page2Page/>,
    document.getElementById('root')
);