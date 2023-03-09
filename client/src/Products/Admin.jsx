import React from 'react'
import Axios from 'axios'
const Admin = () => {
    let [product, setProduct] = React.useState({
        name: "",
        price: "",
        qty: "",
        info: ""
    })
    let updateHandler = (event) => {
        setProduct({ ...product, [event.target.name]: event.target.value })
    }
    let submitHandler = (event) => {
        let url = 'http://localhost:8080/apis/product'
        Axios.post(url, product)
            .then(() => { })
            .catch()
    }
    return (
        <div className='container'>
            <pre>{JSON.stringify(product)}</pre>
            <div className="row">
                <div className="col">
                    <h2>Create Ptoduct </h2>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate suscipit corporis voluptate sit quaerat, animi aspernatur, recusandae necessitatibus eveniet odio blanditiis non, assumenda voluptatum ex cum architecto repellat impedit minus.</p>
                </div>
            </div>
            <div className="row">
                <div className="col-md-5">
                    <div className="card-header">
                        <h4>Create Product</h4>
                    </div>
                    <div className="card-body">
                        <form /* onSubmit={submitHandler} */>
                            <div className='form-group'>
                                <input type="text" className='form-control' placeholder=' Product name' name="name" onChange={updateHandler} />
                            </div>
                            <div className='form-group'>
                                <input type="number" className='form-control' placeholder='price' name="price" onChange={updateHandler} />
                            </div>
                            <div className='form-group'>
                                <input type="number" className='form-control' placeholder='Qty' name="qty" onChange={updateHandler} />
                            </div>
                            <div className='form-group'>
                                <input type="text" className='form-control' placeholder='Info' name="info" onChange={updateHandler} />
                            </div>
                             <div className='form-group'>
                                 <input type="submit" onClick={submitHandler} className=' btn btn-success'  /* value="Create Product" */ /> 
                            </div> 
                            {/* <button className='btn btn-success' onClick={submitHandler}>submit</button>  */}

                        </form>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Admin
