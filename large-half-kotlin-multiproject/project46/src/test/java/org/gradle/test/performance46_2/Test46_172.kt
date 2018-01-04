package org.gradle.test.performance46_2

import org.junit.Assert.*

class Test46_172 {
    private val production = Production46_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
