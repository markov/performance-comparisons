package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_5 {
    private val production = Production47_5("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
