package org.gradle.test.performance43_5

import org.junit.Assert.*

class Test43_418 {
    private val production = Production43_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
