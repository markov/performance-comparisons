package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_134 {
    private val production = Production47_134("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
