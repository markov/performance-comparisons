package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_232 {
    private val production = Production47_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
