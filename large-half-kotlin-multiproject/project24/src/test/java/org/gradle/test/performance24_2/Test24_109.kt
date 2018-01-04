package org.gradle.test.performance24_2

import org.junit.Assert.*

class Test24_109 {
    private val production = Production24_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}