package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_209 {
    private val production = Production47_209("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
