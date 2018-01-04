package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_265 {
    private val production = Production47_265("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
