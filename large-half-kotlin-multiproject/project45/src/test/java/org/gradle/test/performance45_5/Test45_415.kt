package org.gradle.test.performance45_5

import org.junit.Assert.*

class Test45_415 {
    private val production = Production45_415("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
