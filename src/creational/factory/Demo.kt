package creational.factory

fun main(args: Array<String>) {

    var site = WebsiteFactory.getWebsite(WebsiteType.BLOG)

    println(site.getPages())

    site = WebsiteFactory.getWebsite(WebsiteType.SHOP)

    println(site.getPages())

}