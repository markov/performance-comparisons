package org.gradle.test.performance46_4

import org.junit.Assert.*

class Test46_303 {
    private val production = Production46_303("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
