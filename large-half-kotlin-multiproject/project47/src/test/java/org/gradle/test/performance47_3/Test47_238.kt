package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_238 {
    private val production = Production47_238("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
