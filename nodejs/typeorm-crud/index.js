const typeorm = require('typeorm')

const dataSource = new typeorm.DataSource({
    type: "mysql",
    host: "localhost",
    port: 3306,
    username: "root",
    password: "root",
    database: "nodejsdb",
    synchronize: true,
    entities: [ require("./post"), require("./category")],
    logging: true,
})

dataSource.initialize().then(() => {
    console.log(`✅ Successfully Created`)

    var category1 = {
        id: 1,
        name: "Python",
    }
    var category2 = {
        name: "Programming",
    }

    const categoryRepository = dataSource.getRepository('Category')
   // categoryRepository.save(category1).then(saved => {
    //     console.log(`✅ Category Saved`)
    // }).catch(console.log)
    // categoryRepository.save(category2).then(saved => {
    //     console.log(`✅ Category Saved`)
    // }).catch(console.log)

    // categoryRepository.find().then(categories => console.log(categories)).catch(console.log)

    // categoryRepository.delete(2).then(res => console.log(`✅ Deleted Successfully`)).catch(console.log)

    categoryRepository.query('select * from categories')
                        .then(ctgs => console.log(ctgs))
                        .catch(console.log)

    const categories = categoryRepository.createQueryBuilder('Category').where('Category.name like :nm', {nm: '%P%'})
    categories.getMany().then(ctgs => console.log(ctgs))
    
}).catch(error => {
    console.log("❌ Error: ", error)
})