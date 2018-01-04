package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_51 {
    private val production = Production47_51("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
