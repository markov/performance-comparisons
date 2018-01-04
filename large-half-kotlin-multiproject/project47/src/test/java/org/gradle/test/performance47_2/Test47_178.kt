package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_178 {
    private val production = Production47_178("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
