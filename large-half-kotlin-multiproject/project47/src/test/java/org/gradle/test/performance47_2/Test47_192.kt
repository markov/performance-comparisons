package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_192 {
    private val production = Production47_192("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
