package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_388 {
    private val production = Production15_388("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}