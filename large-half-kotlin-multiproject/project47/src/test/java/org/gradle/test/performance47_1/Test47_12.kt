package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_12 {
    private val production = Production47_12("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
