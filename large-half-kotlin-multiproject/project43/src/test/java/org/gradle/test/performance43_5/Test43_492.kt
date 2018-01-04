package org.gradle.test.performance43_5

import org.junit.Assert.*

class Test43_492 {
    private val production = Production43_492("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
