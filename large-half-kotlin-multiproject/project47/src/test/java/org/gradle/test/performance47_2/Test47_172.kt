package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_172 {
    private val production = Production47_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
