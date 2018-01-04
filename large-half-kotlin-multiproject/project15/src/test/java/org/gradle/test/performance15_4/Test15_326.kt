package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_326 {
    private val production = Production15_326("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}