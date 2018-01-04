package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_165 {
    private val production = Production47_165("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
