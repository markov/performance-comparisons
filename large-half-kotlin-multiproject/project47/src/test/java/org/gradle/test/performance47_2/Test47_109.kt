package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_109 {
    private val production = Production47_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
