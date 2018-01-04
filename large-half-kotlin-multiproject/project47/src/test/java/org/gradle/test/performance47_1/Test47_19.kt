package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_19 {
    private val production = Production47_19("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
