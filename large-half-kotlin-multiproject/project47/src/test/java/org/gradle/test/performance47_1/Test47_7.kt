package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_7 {
    private val production = Production47_7("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
